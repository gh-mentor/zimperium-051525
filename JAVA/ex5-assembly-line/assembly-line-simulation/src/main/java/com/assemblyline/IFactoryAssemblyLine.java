package com.assemblyline;
/**
 * This interface defines the IFactoryAssemblyLine interface, which outlines the methods that the FactoryAssemblyLine class must implement.
 */
public interface IFactoryAssemblyLine {
  
  /**
   * Adds a station with the specified ID and processing time.
   *
   * @param stationId The ID of the station.
   * @param processingTime The processing time of the station.
   */
  void addStation(int stationId, int processingTime);

  /**
   * Removes the station with the specified ID.
   *
   * @param stationId The ID of the station.
   */
  void removeStation(int stationId);

  /**
   * Activates the station with the specified ID.
   *
   * @param stationId The ID of the station.
   */
  void startAssembly(int stationId);

  /**
   * Deactivates the station with the specified ID.
   *
   * @param stationId The ID of the station.
   */
  void stopAssembly(int stationId);

  /**
   * Returns the processing time of the specified station.
   *
   * @param stationId The ID of the station.
   * @return The processing time of the station.
   */
  int getProcessingTime(int stationId);

  /**
   * Returns the total processing time of all active stations.
   *
   * @return The total processing time.
   */
  int getTotalProcessingTime();

  /**
   * Returns the total number of stations.
   *
   * @return The total number of stations.
   */
  int getNumStations();

  /**
   * Returns the number of active stations.
   *
   * @return The number of active stations.
   */
  int getNumActiveStations();

  /**
   * Returns the number of inactive stations.
   *
   * @return The number of inactive stations.
   */
  int getNumInactiveStations();

  /**
   * Returns true if the specified station is active, otherwise false.
   *
   * @param stationId The ID of the station.
   * @return True if the station is active, otherwise false.
   */
  boolean isStationActive(int stationId);
}