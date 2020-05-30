# Setup

We recommend using at least Java 8. Using an IDE will help you to get set up quickly and easily.

The exercise is configured to use Gradle. This is a build tool that will download dependencies
(such as a testing library) and do a little bit of project configuration to allow easy running
and testing of the project.

To initialise the project:
- For IntelliJ, you can follow the instructions to open an existing Gradle project at the
    following link: https://www.jetbrains.com/help/idea/gradle.html#gradle_import_project_start
- For Eclipse, you can follow steps 1 and 2 from the following tutorial to get ready to work
    with Gradle projects, and "4. Import an existing Gradle project" to import this project:
    https://www.vogella.com/tutorials/EclipseGradle/article.html

To work with the command line:
- `cd <project_dir>`
- `./gradlew build` - to download necessary dependencies, compile the project, and run the tests
- `./gradlew compileJava` - if you only want to compile the classes
- `./gradlew run` - will run the `Simulator` main class. You can change the main class by updating
    the `javaMainClass` variable in the build.gradle file if you wish.

# The Task: Hotel Simulator

You are a wannabe hotel manager but, given your past as a software engineer, you know the value of
verifying your ideas before implementing them. It would be shame to set up a brand new hotel only
to realise people are more interested in departing to another country rather than the other way around,
after all.

Before setting up your hotel chain, you have decided to build a simulation of guests coming and going
from your hotel. You've created the following classes:
- `Simulator` - the entry point of the simulation. Will generate hotel rooms and guests, as well as printing
    out business summaries
- `BusinessSummary` - a data class containing stats on the hotel's operations
- `Guest` - currently empty
- `Room` - a hotel room with a number
- `Hotel` - the core of your simulation. This will manage checking guests in and out and generating business summaries

The skeleton of your simulation is here, but you must now fill in the blanks:
- Implement some requirements for the guests. You could pick one of the following:
    - Guests may have a maximum price they're willing to pay
    - Some guests will only check in if a sufficiently large room is available
    - Some guests like to avoid crowds and are less likely to check in if the hotel has many occupants
- Implement a way for guests to be checked in to your hotel. This will probably involve storing a collection
    of rooms and assigning guests to free rooms. Reject guests whose requirements don't match with the
    available rooms. E.g., because remaining rooms are too expensive
- Adding requirements to guests may require changes to `Room` such as tracking their size or price
- Implement simulation of a day of operation, generating a summary of the flow of guests in and out and
    the profit made that day 

You have 30 minutes to develop and may change and update any classes you wish. At minimum you will need to
update `Hotel`, `Simulator` and `Guest`. If you wish to focus on correctness, do feel free to write tests
in `HotelTest`. You can run tests via command line using `./gradlew test` from the project directory.

If you finish early, you're welcome to try and implement any other features you can think of. Some ideas are:
- Extra guest requirements. Perhaps different rooms have different accessibilities, and guests with
    mobility impairments will prefer a subset of them
- Extra sources of income. E.g., add a bar. When simulating a day in the hotel, guests may spend a randomised
    length of time in the bar, and additional money will be gained proportional to time spent there
- Focus on correctness, write more tests!

