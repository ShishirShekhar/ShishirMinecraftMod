# Shishir's Minecraft Mod

Welcome to the **Shishir's Minecraft Mod** project! This is a Forge-based Minecraft mod that introduces custom items to enhance your gameplay.

---

## Project Overview

- **Mod ID**: `shishirmod`
- **Mod Name**: Shishir's Minecraft Mod
- **Version**: `0.1.0-1.21.4`
- **Minecraft Version**: `1.21.4`
- **Forge Version**: `54.0.6`
- **License**: MIT License
- **Author**: Shishir Shekhar

This mod adds new items, including "Shishirrite" and "Raw Shishirrite," designed to provide players with new crafting materials and exciting gameplay opportunities.

---

## Features

- **Custom Items**:
  - *Shishirrite*: A rare and powerful material for advanced crafting.
  - *Raw Shishirrite*: The unrefined version of Shishirrite, obtained through mining.

- **Creative Mode Integration**:
  - Items are added to the "Ingredients" tab in Creative Mode.

---

## Getting Started

### Prerequisites

Ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 21 or higher.
- **Gradle**: Version compatible with the project (`6.8+` recommended).
- **Minecraft Forge MDK**: Version `54.0.6`.

### Setting Up the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/ShishirShekhar/ShishirMinecraftMod.git
   cd ShishirMinecraftMod
   ```

2. Import the project into your preferred IDE:
   - For **IntelliJ IDEA**:
     - Open the project folder and let IntelliJ automatically detect the Gradle build file.
   - For **Eclipse**:
     - Use the `gradlew eclipse` command to generate project files.

3. Build the project:

   ```bash
   ./gradlew build
   ```

4. Run the mod in the Minecraft client:

   ```bash
   ./gradlew runClient
   ```

---

## Project Structure

```bash
src/
├── main/
│   ├── java/                # Main Java source files.
│   │   └── net/shishirshekhar/shishirmod/
│   ├── resources/           # Assets and data files.
│   │   ├── META-INF/        # Mod metadata.
│   │   ├── assets/          # Mod textures, models, and localization.
│   │   └── data/            # Data pack files (recipes, advancements, etc.).
gradle/                      # Gradle wrapper files.
build.gradle                 # Gradle build configuration.
settings.gradle              # Gradle settings file.
```

---

## Contribution Guidelines

Contributions are welcome! Please follow these steps:

1. Fork the repository.  
2. Create a feature branch for your changes.  
3. Commit your updates with clear and descriptive messages.  
4. Open a pull request for review and inclusion.  

---

## License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.

---

## Acknowledgments

Special thanks to:

- The **Minecraft Forge** team for providing modding tools and support.
- The Minecraft modding community for tutorials and inspiration.

---

## Contact

For any inquiries, please open an issue in this repository or email me at [sspdav02@gmail.com].

---

*Note: This mod is under active development, and new features will be added in future updates. Stay tuned!*

This `README.md` is designed to provide a comprehensive overview of your project while remaining clear and professional.
