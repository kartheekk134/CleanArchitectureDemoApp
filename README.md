# CleanArchitectureDemoApp
A simple Android app demonstrating Clean Architecture, MVVM, Hilt, Jetpack Compose, and Coroutines. The goal: keep code modular, testable, and easy to scale.

📂 **Layered Folder Structure**

com.yourpackage
│
├── di              # Dependency Injection (Hilt Modules)
├── data            # DTOs, Mapper, Repository Impl, Data Sources
├── domain          # UseCases, Entities, Repository Interfaces
└── presentation    # ViewModels + Compose UI

🧩 **Core Concepts**

MVVM + StateFlow
Use Cases for business logic
Repository pattern
Dependency injection with Hilt
Compose UI with clean state management

🛠 **Tech Used**

Area	Library
UI	Jetpack Compose + Material 3
DI	Hilt
Network	Retrofit + Gson
Concurrency	Coroutines
Architecture	Clean + MVVM

▶️ **Run**

Clone repo
Open in Android Studio
Run on Android 8.0+ device
