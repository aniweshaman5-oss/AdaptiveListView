# Adaptive UI using ListView and ImageView

I have successfully created an adaptive UI leveraging `ListView` and `ImageView` for your project.

## Changes Made
1. **Activity Main Layout**: Updated `activity_main.xml` to include a root `LinearLayout` with the `main` ID required by `MainActivity`, and added a `ListView` to it.
2. **List Item Layout**: The `list_item.xml` layout uses a horizontal `LinearLayout` where the image has a fixed dimension, and the inner vertical `LinearLayout` uses `android:layout_weight="1"`. This approach scales appropriately across different device screen widths, making it adaptive.
3. **Data Model**: Created `ItemModel.java` to encapsulate data (Title, Description, and Image resource).
4. **Custom Adapter**: Added `CustomAdapter.java` that extends `BaseAdapter` to populate your custom `list_item.xml` views dynamically within the `ListView`.
5. **MainActivity Setup**: Initialized sample items inside `MainActivity` (using default launcher icons for demonstration) and bound them to the `ListView` using the custom adapter.

## GitHub Submission
To submit your project via a GitHub link:
1. Open the **Version Control** or **Git** tab in Android Studio (usually at the bottom or top menu).
2. Select **Share Project on GitHub**.
3. Fill in the repository name and click **Share**.
4. Once the repository is created and your initial commit is pushed, you can copy the URL of your new GitHub repository and submit it for your assignment.

The code compiles and is ready to run!