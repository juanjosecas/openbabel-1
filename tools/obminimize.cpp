/**********************************************************************
obminimize.cpp - minimize the energy of a molecule

Copyright (C) 2006 Tim Vandermeersch
Some portions Copyright (C) 2006 Geoffrey R. Hutchison
 
This file is part of the Open Babel project.
For more information, see <http://openbabel.sourceforge.net/>

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation version 2 of the License.
 
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
***********************************************************************/

// used to set import/export for Cygwin DLLs
#ifdef WIN32
#define USING_OBDLL
#endif

#include <openbabel/babelconfig.h>
#include <openbabel/base.h>
#include <openbabel/mol.h>
#include <openbabel/obconversion.h>
#include <openbabel/forcefield.h>
#ifndef _MSC_VER
	#include <unistd.h>
#endif

using namespace std;
using namespace OpenBabel;

int main(int argc,char **argv)
{
  char *program_name= argv[0];
  int c;
  int steps = 2500;
  double crit = 1e-6;
  bool sd = false;
  bool hydrogens = false;
  string basename, filename = "", option, option2, ff = "Ghemical";
  char *oext;
  OBConversion conv;
  OBFormat *format_out = conv.FindFormat("pdb"); // default output format

  if (argc < 2) {
    cout << "Usage: obminimize [options] <filename>" << endl;
    cout << endl;
    cout << "options:      description:" << endl;
    cout << endl;
    cout << "  -c crit     set convergence criteria (default=1e-6)" << endl;
    cout << endl;
    cout << "  -cg         use conjugate gradients algorithm (default)" << endl;
    cout << endl;
    cout << "  -ff ffid    select a forcefield:" << endl;
    cout << endl;
    cout << "  -h          add hydrogen atoms" << endl;
    cout << endl;
    cout << "  -n steps    specify the maximum numer of steps (default=2500)" << endl;
    cout << endl;
    cout << "  -o <format> specify the output format" << endl;
    cout << endl;
    cout << "  -sd         use steepest descent algorithm" << endl;
    cout << endl;
    FOR_EACH(OBForceField, iter) {
      //cout << "              " << iter.ID() << " - " << iter.Description() << endl;
      cout << "              " << iter.ID() << endl;
    }
    exit(-1);
  } else {
    int ifile = 1;
    for (int i = 1; i < argc; i++) {
      option = argv[i];
      
      if ((option == "-n") && (argc > (i+1))) {
        steps = atoi(argv[i+1]);
        ifile += 2;
      }

      if (option == "-sd") {
        sd = true;
        ifile++;
      }
      
      if (strncmp(option.c_str(), "-o", 2) == 0) {
        oext = argv[i] + 2;
        if(!*oext) {
          oext = argv[++i]; //space left after -o: use next argument
          ifile++;
        }

        format_out = conv.FindFormat(oext);
        ifile++;
      }

      if (option == "-h") {
        hydrogens = true;
        ifile++;
      }

      if (option == "-cg")
        ifile++;

      if ((option == "-c") && (argc > (i+1))) {
        crit = atof(argv[i+1]);
        ifile += 2;
      }
 
      if ((option == "-ff") && (argc > (i+1))) {
        ff = argv[i+1];
        ifile += 2;
      }
    }
    
    basename = filename = argv[ifile];
    size_t extPos = filename.rfind('.');

    if (extPos!= string::npos) {
      basename = filename.substr(0, extPos);
    }
  }

  // Find Input filetype
  OBFormat *format_in = conv.FormatFromExt(filename.c_str());    
    
  if (!format_in || !format_out || !conv.SetInAndOutFormats(format_in, format_out)) {
    cerr << program_name << ": cannot read input/output format!" << endl;
    exit (-1);
  }

  ifstream ifs;
  ofstream ofs;

  // Read the file
  ifs.open(filename.c_str());
  if (!ifs) {
    cerr << program_name << ": cannot read input file!" << endl;
    exit (-1);
  }

  OBMol mol;

  for (c=1;;c++) {
    mol.Clear();
    if (!conv.Read(&mol, &ifs))
      break;
    if (mol.Empty())
      break;

    if (hydrogens)
      mol.AddHydrogens();

    OBForceField* pFF = OBForceField::FindForceField(ff);
    if (!pFF) {
      cerr << program_name << ": could not find forcefield '" << ff << "'." <<endl;
      exit (-1);
    }
 
    pFF->SetLogFile(&cout);
    pFF->SetLogLevel(OBFF_LOGLVL_LOW);
      
    if (!pFF->Setup(mol)) {
      cerr << program_name << ": could not setup force field." << endl;
      exit (-1);
    }
      
    if (sd)
      pFF->SteepestDescent(steps, crit);
    else
      pFF->ConjugateGradients(steps, crit);

    pFF->UpdateCoordinates(mol);

    conv.Write(&mol, &cout);
  } // end for loop

  return(1);
}

//
// THIS MAN PAGE IS NO LONGER UP TO DATE:
// SEE DOC/*.1 OR WIKI PAGES
//

/* obminimize man page*/
/** \page minimize the energy for a molecule
*
* \n
* \par SYNOPSIS
*
* \b obminimize [options] \<filename\>
*
* \par DESCRIPTION
*
* The obminimize tool can be used to minimize the energy for molecules 
* inside (multi-)molecule files (e.g., MOL2, etc.)
*
* \par OPTIONS
*
* If no filename is given, obminimize will give all options including the
* available forcefields.
*
* \b -n \<steps\>:
*     Specify the maximum number of steps \n\n
* \b -ff \<forcefield\>:
*     Select the forcefield \n\n
*
* \par EXAMPLES
*  - View the possible options, including available forcefields: 
*   obminimize
*  - Minimize the energy for the molecule(s) in file test.mol2:
*   obminimize test.mol2
*  - Minimize the energy for the molecule(s) in file test.mol2 using the Ghemical forcefield:
*   obminimize -ff Ghemical test.mol2 
*  - Minimize the energy for the molecule(s) in file test.mol2 and set the maximum numer of steps to 300:
*    obenergy -n 300 test.mol2
*
* \par AUTHORS
*
* The obminimize program was contributed by \b Tim \b Vandermeersch.
*
* Open Babel is currently maintained by \b Geoff \b Hutchison, \b Chris \b Morley and \b Michael \b Banck.
*
* For more contributors to Open Babel, see http://openbabel.sourceforge.net/THANKS.shtml
*
* \par COPYRIGHT
*  Copyright (C) 2007 by Tim Vandermeersch. \n \n
*  This program is free software; you can redistribute it and/or modify
*  it under the terms of the GNU General Public License as published by
*  the Free Software Foundation version 2 of the License.\n \n
*  This program is distributed in the hope that it will be useful,
*  but WITHOUT ANY WARRANTY; without even the implied warranty of
*  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*  GNU General Public License for more details.
*
* \par SEE ALSO
*   The web pages for Open Babel can be found at: http://openbabel.sourceforge.net/ \n
*   The web pages for Open Babel Molecular Mechanics can be found at: 
*   http://openbabel.sourceforge.net/wiki/Molecular_mechanics \n
**/
