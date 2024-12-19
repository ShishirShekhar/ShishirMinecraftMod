# Template Mod

Welcome to the **Template Mod** project! This is a Forge-based Minecraft mod designed as a starting template for mod development.

## Project Overview

- **Mod ID**: `templatemod`
- **Mod Name**: Template Mod
- **Version**: `0.0.1-1.21.4`
- **Minecraft Version**: `1.21.4`
- **Forge Version**: `54.0.6`
- **License**: All Rights Reserved
- **Author**: Shishir Shekhar

This mod provides a foundational setup for creating a Minecraft mod using Forge. It includes necessary configurations, a basic structure, and is ready for customization.

---

## Features

- Pre-configured Forge MDK setup.
- Example mod structure.
- Predefined build scripts and mappings.

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
   git clone https://github.com/ShishirShekhar/Minecraft-Mod-Template.git
   cd Minecraft-Mod-Template
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

``` bash
src/
├── main/
│   ├── java/                # Main Java source files.
│   │   └── net.shishirshekhar.templatemod/
│   ├── resources/           # Assets and data files.
│   │   ├── META-INF/        # Mod metadata.
│   │   ├── assets/          # Mod textures, models, and localization.
│   │   └── data/            # Data pack files (recipes, advancements, etc.).
gradle/                      # Gradle wrapper files.
build.gradle                 # Gradle build configuration.
settings.gradle              # Gradle settings file.
```

---

## Troubleshooting

### Common Issues

1. **Access Denied Errors**: Ensure you have proper permissions for all directories.
2. **Build Errors**: Verify your JDK version and Gradle version.
3. **Run Issues**: Ensure your Minecraft version matches the mod and Forge version.

---

## Contribution Guidelines

Contributions are welcome! Please fork the repository and submit a pull request for review. Ensure your code adheres to project guidelines.

---

## License

This mod is licensed under **All Rights Reserved**. For more details, review the `LICENSE` file.

---

## Acknowledgments

Special thanks to:

- The **Minecraft Forge** team for their tools and libraries.
- The open-source Minecraft community for their support and tutorials.

---

## Contact

For any inquiries, you can reach me at [sspdav02@gamil.com].
