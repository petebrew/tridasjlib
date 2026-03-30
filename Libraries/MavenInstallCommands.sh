# These jars are not available from Maven Central. They are now published to the
# GitHub Packages registry for this repository:
#
#   https://maven.pkg.github.com/petebrew/tridasjlib
#
# If you have GitHub Packages credentials configured in ~/.m2/settings.xml with a
# <server> entry whose id is "github", Maven can resolve them from the registry.
# The commands below remain as a fallback to install the bundled copies into your
# local Maven repository manually.

mvn install:install-file -DgroupId=com.sun.tools.xjc                       -DartifactId=collection-setter-injector -Dversion=0.1    -Dpackaging=jar -Dfile=collection-setter-injector.jar
mvn install:install-file -DgroupId=org.jvnet.jaxb2_commons                 -DartifactId=xjc-if-ins                 -Dversion=0.5.2  -Dpackaging=jar -Dfile=xjc-if-ins+generics.jar
mvn install:install-file -DgroupId=org.tridas.schema                       -DartifactId=tridasaandi                -Dversion=1.0    -Dpackaging=jar -Dfile=TridasAandI.jar
mvn install:install-file -DgroupId=org.tridas.schema                       -DartifactId=tridas-annotations         -Dversion=1.0    -Dpackaging=jar -Dfile=TridasAnnotationsPlugin.jar
