# Task: Redesign a Media Player Application with Interface Segregation Principle

## What we built
- Separated playback contracts into audio (`AudioPlayer`) and video (`VideoPlayer`) so clients never implement unused controls.
- Added focused implementations: `MusicPlayer` for audio flows and `MoviePlayer` for video flows.
- Demonstrated both players in `App` to show how each interface stands alone.

## Why it meets the task
- Each player depends only on the interface it needs, showing Interface Segregation in practice.
- No class is forced to provide irrelevant methods, keeping implementations lean and readable.

## How to run
- Build and run tests: `mvn test`
- Run the sample: `mvn exec:java -Dexec.mainClass="com.epam.campus.App"`

## Takeaway
Segregating interfaces keeps clients small, clear, and easier to evolve when new media capabilities appear.
