BridJ erfolgreich gebaut unter Debian und Java 1.8
Stand gespeichert unter https://github.com/jschneeberger/BridJ neuer Branch debian_java8
Mit mvn clean install - jar gebaut: BridJ/target/bridj-0.7.1-SNAPSHOT.jar
Gespeichert ins lokale maven repository
mvn install:install-file -Dfile=BridJ/target/bridj-0.7.1-SNAPSHOT.jar -DgroupId=com.ontolics -DartifactId=bridj -Dversion=0.7.1 -Dpackaging=jar -DgeneratePom=true
Erfolgreich gebaut: https://github.com/jschneeberger/clingo4j unter Debian und Java 1.8
Gespeichert im Branch debian_java8
