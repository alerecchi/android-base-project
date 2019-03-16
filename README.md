# Android Base Project
My version of a barebone project to quickly start developing new apps

## Setup
Dependencies and versions are grouped in the buildSrc folder in the Dependency.kt and Version.kt files

The project includes already these following library configured:

* Dagger 2 (+ Dagger Android)
* Retrofit + Gson + OkHttp
* Room DataBase
* Gradle Versions Plugin by Ben Manes to check dependency updates (since standard lint doesn't work with the buildSrc setup)
* RxJava + RxAndroid
* RecyclerView base setup to handle multiple types of Viewholders (+ sort of Viewholder lifecycle out of the box)

More libraries alredy defined and ready to use

## How to use
Download the project and before opening it with Android Studio rename these folders reflecting the new project name and package:
* Root project folder
* Folders inside src/main, src/test, src/androidTest

After this open the project in Android Studio and replace all occurrencies of "alerecchi" and/or "baseproject" with the new project name
