javac -cp "./tasks/lib/sqlite-jdbc-3.49.1.0.jar" -d build ./tasks/*.java
cd ./build
java tasks.Main $1 $2 $3 $4 $5
