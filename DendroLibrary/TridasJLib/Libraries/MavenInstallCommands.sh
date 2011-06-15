# The Jars within this folder are those not found in standard Maven repositories.  They have been
# placed in the maven.tridas.org repository but are included here in case this repository becomes
# unavailable.  The jars can be installed with the following commands:

mvn install:install-file -DgroupId=com.sun.tools.xjc                       -DartifactId=collection-setter-injector -Dversion=0.1    -Dpackaging=jar -Dfile=collection-setter-injector.jar
mvn install:install-file -DgroupId=org.jvnet.jaxb2_commons                 -DartifactId=xjc-if-ins                 -Dversion=0.5.2  -Dpackaging=jar -Dfile=xjc-if-ins+generics.jar
mvn install:install-file -DgroupId=org.tridas.schema                       -DartifactId=tridasaandi                -Dversion=1.0    -Dpackaging=jar -Dfile=TridasAandI.jar
mvn install:install-file -DgroupId=org.tridas.schema                       -DartifactId=tridas-annotations         -Dversion=1.0    -Dpackaging=jar -Dfile=TridasAnnotationsPlugin.jar