## Java sources ##
The project is provided as Java source files that can be downloaded from the project SVN.

## External libraries ##

The implementation is based on the following external libaries:

  * [Matrix Toolkits for Java (MTJ)](http://ressim.berlios.de/)
  * [Snowball Stemmer](http://snowball.tartarus.org/)
  * [Terrier](http://ir.dcs.gla.ac.uk/terrier/) (Version 3)
  * [Apache Commons CLI](http://commons.apache.org/cli/)
  * [Apache Commons Collections](http://commons.apache.org/collections/)
  * [Apache Commons Configuration](http://commons.apache.org/configuration/)
  * [Apache Commons Lang](http://commons.apache.org/lang/)
  * [Apache Commons Logging](http://commons.apache.org/logging/)
  * [Apache log4j](http://logging.apache.org/log4j/1.2/index.html)
  * [GNU Trove](http://trove4j.sourceforge.net/)
  * [Spring Framework](http://www.springsource.org/) (Version 3)

For access to the Wikipedia database a JDBC driver is needed. In most cases this will be the Java MySQL connector.

Research-esa is also based on the library _ir\_framework\_4.0.jar_, which is included in the _/lib_ directory. Please refer to the [API of ir\_framework-4.0](http://www.aifb.uni-karlsruhe.de/WBS/pso/ir_framework-4.0/) for more information.

## Maven ##
Introduced in version 2.0, [Maven](http://maven.apache.org/) can be used to organize dependencies. The project configuration file _pom.xml_ is included in the project sources.

## Running the demo ##
After compiling the sources the demo can be started as described in the [Tutorial](Tutorial.md).

## Problems ##
Several known problems are listed on our [Troubleshooting](Troubleshooting.md) page.