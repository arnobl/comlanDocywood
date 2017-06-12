## The Target Platform Definition DSL

The Eclipse **Target Platform** refers to the Eclipse plug-ins which your workspace will be built and run against. It describes the platform that you are developing for.<br>
For example, the following picture shows the Xtext target platform that provides various Eclipse plugins with different versions and from different sources.

**The Target Platform Definition DSL** aims at easing the definition of Eclipse target platforms. End users describe the target platform they want. An Eclipse target platform file is then generated.

**Target Platform definition files have the tpd file extension**. In eclipse, create a new file and set this extension to create a Target Platform definition model.

## Exercise
Define a target platform called “My target platform” that contains sources of plug-ins only.<br>
This target platform must export from “http://www.kermeta.org/k3/update/” the plugins:
- fr.inria.diverse.k3.ui with the version 3.2.1 or 3.2.2
- fr.inria.diverse.k3.ui.templates with the version 3.2.1 or 3.2.2

This target platform must work with x86_64 and JavaSE-1.8.

In a second target platform file you will create (nevermind its name), export from a location “http://download.eclipse.org/egit/updates/” you will call “egit” the following plug-in:
- org.eclipse.egit (nevermind the version)

Import the second target platform file in your first one.
