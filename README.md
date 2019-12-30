# BottomSheet  


Android Bottom Sheet component slides up from the bottom showing more relevant content.  

There are two types of bottom sheets, **Persistent Bottom Sheet** and **Modal Bottom Sheet**.  

**Persistent Bottom Sheet**  
This bottom sheet displays in-app content. It will be displayed at the bottom of the screen with some of its portion visible (we can define dimensions in dp), it shows full content after expanding it.  
It has a smaller elevation.  

<p align="center">
  <img src="https://miro.medium.com/max/300/1*D7zRxE6TaelZZ3IA1hcmAw.png"   width=200 height=350/>
</p>

**Modal Bottom Sheet**  
This bottom sheet works as a menu or dialog with options, it means this replaces menu or dialog. It has a higher elevation than the persistent bottom sheet.  
Generally, they are used for integrating deep linking picker actions.  

<p align="center">
  <img src="https://miro.medium.com/max/1600/1*sXijp1Azg6XCBETfz5XZ1w.png" width=450 height=450 />
</p>


**Add support design dependency**  
```gradle
implementation 'com.android.support:design:28.0.0'
```

**Bottom sheets have 5 states:**  

| State  | Description |
| ------------- | ------------- |
|STATE_COLLAPSED| The bottom sheet is visible but only showing its peek height. This state is usually the `resting position` of a Bottom Sheet. The peek height is chosen by the developer and should be enough to indicate there is extra content, allow the user to trigger an action or expand the bottom sheet. |
|STATE_EXPANDED| The bottom sheet is visible and its maximum height and it is neither dragging or settling |
|STATE_DRAGGING| The user is actively dragging the bottom sheet up or down. |
|STATE_SETTLING| The bottom sheet is settling to specific height after a `drag/swipe` gesture. This will be the peek height, expanded height, or 0, in case the user action caused the bottom sheet to hide. |
|STATE_HIDDEN| The bottom sheet is no longer visible. |


