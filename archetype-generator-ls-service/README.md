## archetype-generator-ls-service 1.0.0.RC
this project is a example for create an archetype project for layer services.

this archetype create a project with:
- Springboot 2.5
- java 11
- sprig cloud libraries




## How create a new project from this archetype version
for create a new project from this archetype service layer version, you new to do:

- compile the archetype 
    ```
	mvn clean install 
    ```
- intall the archetype on maven repository, you must be on target folder:
	```
    mvn install:install-file -Dfile=archetype-generator-ls-service-1.0.0.RC.jar -DgroupId=com.tyr.archetype-generator-ls -DartifactId=archetype-generator-ls-service -Dversion=1.0.0.RC -Dpackaging=jar -DgeneratePom=true -DcreateChecksum=true 
	```
- create a new artefact from archetype project on a empty folder, example:
	```
	mvn archetype:generate -B -DarchetypeGroupId=com.tyr.archetype-generator-ls -DarchetypeArtifactId=archetype-generator-ls-service 
	-DarchetypeVersion=1.0.0.RC -DgroupId=com.tyr.service.ls.primero -DartifactId=ls-primero-service -DserviceName=Primero -DlowerServiceName=primero
	```

## Where :
- DarchetypeGroupId: Archetype Group ID.
- DarchetypeArtifactId: Archetype Artyfact ID.
- DarchetypeVersion: create new artifact from archetype version.
- DgroupId: from the new project.
- DartifactId: from the new project.
- DserviceName: Main mame from the project.
- DlowerServiceName: lowerCase from Main name from the project.