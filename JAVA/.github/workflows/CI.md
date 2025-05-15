Create a workflow file in the '.github/workflows/build_and_test.yml' using GitHub Actions.

Set the workflow name to 'wf-build-and-test'.

The workflow is triggered on three types of events:

1) **Push Events**: The workflow runs whenever there is a push to the main branch. Additionally, it only triggers if the changes are within the `src` or `tests` directories. This ensures that the workflow only runs when relevant files are modified, optimizing the build and test process.

2) **Pull Request Events**: Similar to push events, the workflow is triggered when a pull request is made to the main branch. Again, it only triggers if the changes are within the `src` or `tests` directories. This helps in verifying that the changes in the pull request do not break the build or tests before merging into the main branch.

3) **Workflow Dispatch**: This allows the workflow to be triggered manually via the GitHub Actions interface.

Create a job named 'build-and-test' that runs on the latest version of the Ubuntu virtual environment.

Workflow steps:
- **Checkout repository**: Use the `actions/checkout@v4` action to check out the repository.
- **Set up Java**: Use the `actions/setup-java@v3` action to set up the Java environment and specify the required Java version (e.g., Java 17).
- **Restore dependencies**: Run `./mvnw dependency:resolve` to restore the project dependencies.
- **Build the project**: Run `./mvnw clean package` to build the project and create the JAR file.
- **Run tests**: Run `./mvnw test` to execute the tests and ensure the project passes all test cases.