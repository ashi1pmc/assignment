# assignment

Data Source: https://gist.githubusercontent.com/joelbirchler/66cf8045fcbb6515557347c05d789b4a/raw/9a196385b44d4288431eef74896c0512bad3defe/exoplanets

Key Columns
1: Primary identifier of planet
2: Binary flag [0=no known stellar binary companion; 1=P-type binary (circumbinary); 2=S-type binary; 3=orphan planet (no star)]
4: Radius [Jupiter radii]
15: Discovery year [yyyy]
23: Host star temperature [K]


Source Layout
|-src
|  |-com
|     |-assignment
|         |-pojo
|         |    |-Band.java
|         |    |-Planet.java
|         |-Assignment.java
|
|-lib
|   |-jackson-annotations-2.10.0.jar
|   |-jackson-core-2.10.0.jar
|   |-jackson-databind-2.10.0.jar
|
|-test
|   |-com
|      |-assignment
|			|-AssignmnetTest.java
|			|-TestUtil.java      
| 
|- dist (created during build process, contains assignment.jar)
|    
|-build.xml          


Prerequite 
1. To build - JDK 1.8, Ant
2. To Run   - JRE 1.8


To Build code
1. Download package
2. Add JAVA_HOME and ANT_HOME to enviroment variales
3. Run ant build

To "Run" code
1. Open command line, browse to dist directory
2. Run the following command "java -jar path_to_assignment.jar"

For quick run\access, assignment.jar is already submitted to dist directory.

To run "Unit Tests"
1. Open command line, browse to dist directory
2. Run the following command "java -cp assignment-test.jar com.assignments.TestRunner"
