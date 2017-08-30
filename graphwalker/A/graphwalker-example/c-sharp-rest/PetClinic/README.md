This example will run simulated test using GraphWalker started as a REST service.

 * Download [latest GraphWalker standalone jar](http://graphwalker.org/archive/graphwalker-cli-3.4.0.jar).
 * `git clone https://github.com/GraphWalker/graphwalker-example.git`
 * `cd c-sharp-rest/PetClinic`
 * Download [latest GraphWalker standalone jar](http://graphwalker.org/archive/graphwalker-cli-3.4.0.jar).
 * Start GraphWalker as a restful service: `java -jar graphwalker-cli-3.4.0.jar -d all online -o -s RESTFUL`.
 * Build the PetClinic project.<br>
   On linux: `xbuild `
 * Run the program:
   On linux: `mono PetClinic/bin/Debug/PetClinic.exe`

When run, the PetClinic program will connect to the GraphWalker service.



