# Assembly Line Simulation

In this exercise, you will implement all methods of the `FactoryAssemblyLine` class. The `FactoryAssemblyLine` class is a minimal simulation of an assembly line in a factory. The `tests` folder contains completed JUnit 5 test cases that will validate your implementation.

The goal of this exercise is to implement the `FactoryAssemblyLine` class so that all tests pass.

## Instructions

1. **Class Overview**: The `FactoryAssemblyLine` class represents an assembly line with multiple stations. Each station has a unique ID, a processing time, and an active/inactive state.

2. **Required Methods**:
   - `void addStation(int stationId, int processingTime)`: Adds a station with the specified ID and processing time.
   - `void removeStation(int stationId)`: Removes the station with the specified ID.
   - `void startAssembly(int stationId)`: Activates the station with the specified ID.
   - `void stopAssembly(int stationId)`: Deactivates the station with the specified ID.
   - `int getProcessingTime(int stationId)`: Returns the processing time of the specified station.
   - `int getTotalProcessingTime()`: Returns the total processing time of all active stations.
   - `int getNumStations()`: Returns the total number of stations.
   - `int getNumActiveStations()`: Returns the number of active stations.
   - `int getNumInactiveStations()`: Returns the number of inactive stations.
   - `boolean isStationActive(int stationId)`: Returns `true` if the specified station is active, otherwise `false`.

3. **Error Handling**:
   - Throw an `IllegalArgumentException` if invalid arguments are provided (e.g., negative station IDs or processing times).
   - Throw an `IllegalStateException` if attempting to add a duplicate station or remove/start/stop a non-existent station.

4. **Implementation Details**:
   - Use a `HashMap` to store station data, where the key is the station ID, and the value is an object containing the processing time and active state.
   - Ensure proper error handling and validation in all methods.
   - Use descriptive names for variables and methods, following Java naming conventions.

5. **Testing**:
   - The `tests` folder contains JUnit 5 test cases to validate your implementation.
   - Run the tests using your preferred IDE or build tool (e.g., Maven or Gradle).
   - Ensure all tests pass before submitting your solution.

6. **Additional Notes**:
   - Use `final` for fields that do not change after initialization.
   - Follow best practices for Java development, including proper use of exceptions, consistent naming conventions, and clean code principles.

Good luck, and happy coding!

