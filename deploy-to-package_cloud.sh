rm -rf target
rm dependency-reduced-pom.xml
ls

git pull --all
project_version=`mvn help:evaluate -Dexpression=project.version -q -DforceStdout`
mvn package -Dmaven.test.skip=true
project_name=console
package_cloud push git-leon/utils ./target/$project_name-$project_version.jar --coordinates=com.github.git-leon:$project_name:$project_version