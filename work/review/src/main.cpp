/*
This app simulates a workload using a lambda function and a packaged task.
*/

/*
Include headers for input/output stream, future, chrono, thread, functional, and random
*/
#include "task.h"
#include <iostream>
#include <future>
#include <chrono>
#include <thread>
#include <functional>
#include <random>
#include <stdexcept>

/*
TODO: 
Move the definition of the 'job' lambda function from inside the main() function to the global scope (outside of any function).
- This allows 'job' to be accessed from anywhere in this source file, not just within main().
- Ensure that 'job' remains a lambda function with the same signature and logic.
- After moving, update main() to use the global 'job' lambda as before.
*/

int main()
{

    /*
    Create a lambda function named 'job' that simulates a workload.
    Arguments:
    - 'workload': an integer representing the number of steps in the workload
    Returns: void
    Details:
    - Use a 'for loop' to to simulate a workload by iterating from the given workload value down to 1.
    - For each iteration, it performs the following steps:
        1) Generates a random sleep time between 0.5 and 1.5 seconds.
        2) Pauses the execution for the generated sleep time.
        3) Prints a message indicating the completion of the current step.
    Errors:
    - If the workload is less than or equal to 0, the function should throw an invalid_argument exception with the message "Invalid workload value".
    Example:
    job(10);
    */
    auto job = [](int workload) -> void
    {
        for (int i = workload; i > 0; --i)
        {
            /*
            TODO:
            REPLACE the code below that generates the random sleep time with a call to a new function named 'uniform_distribution'.
            - Implement 'uniform_distribution' as a standalone function.
            - Arguments:
                - 'min': a double specifying the minimum value of the distribution.
                - 'max': a double specifying the maximum value of the distribution.
            - Returns:
                - a double representing a random value uniformly distributed between 'min' and 'max' (inclusive).
            - Use this function to generate the sleep time for each iteration.
            */
            std::random_device rd;
            std::mt19937 gen(rd());
            std::uniform_real_distribution<double> dis(0.5, 1.5);
            double sleepTime = dis(gen);
            std::this_thread::sleep_for(std::chrono::duration<double>(sleepTime));
            // Log the completion message
            std::clog << "Completed step #" << i << '\n';
        }
    };

    const int steps = 10;
    execute(job, steps);

    return 0;
}
