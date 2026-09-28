
# Experiment 7: Create an Adaptive UI Using ListView and ImageView

## 1. Experiment Details

**Experiment No.:** 7

**Title:** Create an Adaptive UI Using ListView and ImageView

**Platform:** Android Studio

**Programming Language:** Kotlin

**UI Design:** XML

**Application Name:** AdaptiveListView

**Package Name:** `com.example.exp7`

---

## 2. Aim

To design and develop an adaptive Android user interface using ListView and ImageView that displays a collection of destinations with images and descriptions. The application adapts its layout to different screen orientations and sizes while providing interactive destination selection.

---

## 3. Objectives

- To understand the implementation of ListView in Android.
- To use ImageView for displaying images within a list and a details panel.
- To implement a custom ArrayAdapter for displaying customized list items.
- To handle user interactions using OnItemClickListener.
- To design adaptive layouts for portrait and landscape orientations.
- To understand Android resource qualifiers for supporting different screen sizes.
- To test the application under different conditions and verify its functionality.

---

## 4. Description of the Experiment

This experiment demonstrates the development of an adaptive Android application using ListView and ImageView. The application, named **Destination Explorer**, displays a collection of popular tourist destinations, including Bengaluru, Mysuru, Goa, Manali and Jaipur.

Each destination is represented by an image, a name and a short description. A custom ArrayAdapter is used to populate the ListView with destination data and corresponding images.

When a user selects a destination, the application dynamically updates the details panel with the selected destination's image, name and description.

The application uses different XML layouts to support portrait and landscape orientations. In portrait mode, the destination list is displayed above the details panel. In landscape mode, the list and details panel are arranged side by side.

The application demonstrates the use of Android UI components, event handling, custom adapters and adaptive layouts.

---

## 5. Scenario Used

### Destination Explorer Application

The scenario used in this experiment is a destination explorer application that allows users to browse popular tourist destinations.

The application contains the following destinations:

| Destination | Description |
|---|---|
| Bengaluru | The Garden City of India |
| Mysuru | Famous for its royal heritage |
| Goa | Known for its beaches and tourism |
| Manali | A scenic Himalayan hill station |
| Jaipur | The Pink City of Rajasthan |

### Application Workflow

1. The application launches and displays the Destination Explorer interface.
2. A ListView displays all available destinations with their images and descriptions.
3. The user scrolls through the list to explore the destinations.
4. When a destination is selected, the details panel displays its corresponding image, name and description.
5. The interface adapts automatically when the device orientation or available screen size changes.

---

## 6. Technologies Used

| Technology | Purpose |
|---|---|
| Android Studio | Integrated development environment |
| Kotlin | Application logic and event handling |
| XML | User interface design |
| ListView | Displaying a scrollable list of destinations |
| ImageView | Displaying destination images |
| ArrayAdapter | Connecting destination data to the ListView |
| LinearLayout | Arranging UI components |
| Android Resource Qualifiers | Supporting different screen configurations |
| Android Emulator | Running and testing the application |
| Git and GitHub | Version control and project submission |

---

## 7. Concepts Used

### 7.1 ListView

ListView is an Android UI component used to display a vertically scrollable list of items. In this experiment, it displays the available destinations, each containing an image, a name and a description.

### 7.2 ImageView

ImageView is an Android UI component used to display images. It is used to display destination thumbnails in the ListView and a larger image in the details panel.

### 7.3 Custom ArrayAdapter

A custom ArrayAdapter connects a collection of Destination objects to the ListView. It inflates the custom item layout and populates its ImageView and TextViews with the corresponding data.

### 7.4 OnItemClickListener

OnItemClickListener is used to detect when a user selects an item in the ListView. When an item is selected, the application updates the details panel with the selected destination's information.

### 7.5 Adaptive UI

An adaptive UI adjusts its arrangement according to the available screen space and device configuration.

This experiment uses Android resource qualifiers to provide different layouts for portrait, landscape and larger screens.

- **Portrait:** The ListView appears above the details panel.
- **Landscape:** The ListView appears on the left and the details panel on the right.
- **Large screens:** A two-panel layout is provided for devices with a smallest screen width of at least 600dp.

---

## 8. Project Folder Structure

```text
AdaptiveListView/
│
├── app/
│   ├── build.gradle.kts
│   │
│   └── src/
│       └── main/
│           │
│           ├── java/
│           │   └── com/
│           │       └── example/
│           │           └── exp7/
│           │               ├── MainActivity.kt
│           │               ├── Destination.kt
│           │               └── DestinationAdapter.kt
│           │
│           ├── res/
│           │   ├── drawable/
│           │   │   ├── bengaluru.jpg
│           │   │   ├── mysuru.jpg
│           │   │   ├── goa.jpg
│           │   │   ├── manali.jpg
│           │   │   └── jaipur.jpg
│           │   │
│           │   ├── layout/
│           │   │   ├── activity_main.xml
│           │   │   └── item_destination.xml
│           │   │
│           │   ├── layout-land/
│           │   │   └── activity_main.xml
│           │   │
│           │   ├── layout-sw600dp/
│           │   │   └── activity_main.xml
│           │   │
│           │   └── values/
│           │
│           └── AndroidManifest.xml
│
├── docs/
│   └── screenshots/
│       ├── Output.png
│       ├── TC01_Initial_Output.png
│       ├── TC02_Destination_Selection.png
│       └── TC03_Adaptive_UI_USN.png
│
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

### Description of Important Files

| File | Description |
|---|---|
| MainActivity.kt | Initializes the application, creates the destination list, attaches the adapter and handles item selection. |
| Destination.kt | Defines the Destination data class containing the name, description and image resource ID. |
| DestinationAdapter.kt | Implements the custom ArrayAdapter to display destination data in the ListView. |
| activity_main.xml | Defines the main portrait user interface. |
| item_destination.xml | Defines the layout of an individual destination row. |
| layout-land/activity_main.xml | Defines the landscape user interface. |
| layout-sw600dp/activity_main.xml | Defines the two-panel layout for larger screens. |
| AndroidManifest.xml | Declares the application and its Android components. |
| docs/screenshots/ | Stores the application output and test case screenshots. |

---

## 9. Implementation

### 9.1 Data Model

The Destination data class stores the information associated with each destination.

It contains three properties:

- name: The name of the destination.
- description: A short description of the destination.
- imageResId: The drawable resource ID of the destination image.

### 9.2 Custom Adapter

DestinationAdapter extends ArrayAdapter and overrides the getView() method.

The adapter performs the following operations:

1. Inflates the item_destination.xml layout.
2. Retrieves the destination object at the specified position.
3. Finds the ImageView and TextViews in the row layout.
4. Assigns the destination image, name and description.
5. Reuses existing row views through convertView when available.

### 9.3 Main Activity

MainActivity initializes the application and performs the following operations:

1. Loads the activity_main.xml layout.
2. Initializes the ListView and details panel components.
3. Creates a list of Destination objects.
4. Initializes the DestinationAdapter.
5. Attaches the adapter to the ListView.
6. Implements OnItemClickListener to handle destination selection.
7. Updates the details panel when the user selects a destination.

### 9.4 Adaptive Layout Implementation

The application uses Android resource qualifiers to select an appropriate layout.

| Resource directory | Purpose |
|---|---|
| res/layout/ | Default portrait layout |
| res/layout-land/ | Landscape layout |
| res/layout-sw600dp/ | Layout for larger screens |

Android automatically selects the appropriate layout resource according to the device configuration. All layouts use the same view IDs, allowing MainActivity to work with each layout without separate activity implementations.

---

## 10. Application Output

The application displays a destination explorer interface containing a list of destinations and a details panel.



---

## 11. Test Cases

Three test cases are used to verify the application's functionality, destination selection and adaptive layout.

### Test Case 1: Verify Initial Application Output

**Test Case ID:** TC-01

**Test Objective:** To verify that the application launches successfully and displays the destination list.

**Precondition:** The application is installed on the Android emulator.

**Test Steps:**
1. Launch the application.
2. Observe the initial screen.
3. Verify the application title and destination list.
4. Check that all five destinations and their images are displayed.
5. Verify the initial details panel.

**Expected Result:**

The application should launch successfully and display the destination list, images, descriptions and initial details panel.

**Actual Result:** [Enter the observed result.]

**Status:** [Pass/Fail]

**Screenshot:**

![Test Case 1 - Initial Output](![alt text](<Screenshot 2026-09-28 215958.png>))

---

### Test Case 2: Verify Destination Selection

**Test Case ID:** TC-02

**Test Objective:** To verify that selecting a destination updates the details panel correctly.

**Precondition:** The application is running, and the destination list is visible.

**Test Steps:**
1. Launch the application in portrait mode.
2. Select Goa from the destination list.
3. Observe the details panel.
4. Verify the selected destination's image.
5. Check the destination name and description.

**Expected Result:**

The details panel should display the Goa image, the title "Goa" and the description "Known for its beaches and tourism".

**Actual Result:** [Enter the observed result.]

**Status:** [Pass/Fail]

**Screenshot:**

![Test Case 2 - Destination Selection](![alt text](<Screenshot 2026-09-28 220043.png>))

---

### Test Case 3: Verify Adaptive UI and Student Details

**Test Case ID:** TC-03

**Test Objective:** To verify the application's adaptive layout and the visibility of student identification details.

**Student Details:**

- Name: [Enter your name]
- USN: [Enter your USN]

**Precondition:** The application is installed and running on an emulator that supports orientation changes.

**Test Steps:**
1. Launch the application in portrait mode.
2. Rotate the device to landscape orientation.
3. Verify that the destination list and details panel are arranged side by side.
4. Select Manali from the destination list.
5. Verify the selected destination's image, name and description.
6. Verify that the student's name and USN are visible.
7. Capture a screenshot of the application.

**Expected Result:**

The application should display the landscape layout correctly. The destination details should update when an item is selected, and the student's name and USN should be visible.

**Actual Result:** [Enter the observed result.]

**Status:** [Pass/Fail]

**Screenshot:**

![Test Case 3 - Adaptive UI and Student Details](![alt text](<Screenshot 2026-09-28 220442.png>))

---

## 12. Test Summary

| Test Case | Description | Expected Functionality | Status |
|---|---|---|---|
| TC-01 | Initial application output | Displays all destinations and the initial details panel | [Pass/Fail] |
| TC-02 | Destination selection | Updates the details panel with the selected destination | [Pass/Fail] |
| TC-03 | Adaptive UI and student details | Adapts to landscape orientation and displays student details | [Pass/Fail] |

---

## 13. How to Run the Project

### Prerequisites

- Android Studio
- Android SDK
- Kotlin support
- Android emulator or a physical Android device

### Execution Steps

1. Clone or download the project from GitHub.
2. Open the project in Android Studio.
3. Allow Gradle synchronization to complete.
4. Select an Android emulator or connect a physical device.
5. Click the Run button.
6. Wait for the application to install and launch.
7. Test the destination list and adaptive layouts.

---

## 14. Learning Outcomes

After completing this experiment, the following concepts are demonstrated:

1. Implementation of ListView for displaying scrollable data.
2. Use of ImageView for displaying images in Android applications.
3. Creation of custom ArrayAdapters for displaying structured data.
4. Handling user interactions using OnItemClickListener.
5. Development of adaptive user interfaces using XML layouts.
6. Use of Android resource qualifiers for different screen configurations.
7. Testing and validating Android applications using an emulator.
8. Understanding the separation of data, adapter logic and UI components in Android development.

---

## 15. Conclusion

The AdaptiveListView experiment demonstrates the implementation of an interactive Android application using ListView and ImageView. A custom ArrayAdapter is used to display destination information, while OnItemClickListener enables users to select destinations and view their corresponding details.

Adaptive XML layouts allow the application to present its content differently according to screen orientation and available screen size. The experiment provides practical experience in Android UI development, event handling, resource management and application testing.

---

## 16. GitHub Submission

**GitHub Repository:** [Add your GitHub repository URL here]

**Experiment:** 7 - Adaptive UI Using ListView and ImageView

**Student Name:** [Enter your name]

**USN:** [Enter your USN]