LLVM IR editor plugin for Eclipse
=================================

This project is an Eclipse plugin that adds a feature-rich LLVM IR Editor.

For feature list and download instructions, please visit the [official site](http://amishne.github.com/llvm-ir-editor). Below is a developer FAQ for anyone interested with fiddling with the code; for a general user FAQ, please visit the official site.

Developer FAQ
-------------

#### Under what license is this released?

[BSD (3-clause license)](http://opensource.org/licenses/BSD-3-Clause).

#### Who is maintaining this project?

[Alon Mishne](https://github.com/amishne).

#### How is Intel connected to this project?

This project started as an internal project at Intel and was later donated to the open-source community.

#### What libraries or frameworks are used?

This plugin is built on top of Eclipse's [Xtext framework](http://www.eclipse.org/Xtext/).

#### Does this plugin use actual code from LLVM?

Nope.

#### Does this plugin invoke any LLVM executables?

Nope.

#### Is it okay to submit a patch for "refactoring" purposes only?

Yes. If you think a certain piece of code could have been written better, please submit a patch.

#### Where are the tests?

Theoretically, they are under the [com.intel.llvm.ireditor.tests project](https://github.com/amishne/llvm-ir-editor/tree/master/com.intel.llvm.ireditor.tests). In practice, there are no tests yet.

#### What is the source of the LLVM IR grammar?

It is manually written based on the [LLVM Language Reference Manual](http://llvm.org/docs/LangRef.html) and on experimentation with the actual LLVM executables when the manual was unclear.

#### What is the "visualizer" project?

It's an effort to add a new Eclipse "view" to the plugin which will contain a live (updated when the code is updated) graph visualization of basic blocks in the current function.
It's still far from being ready so it's not a part of the plugin update site.
