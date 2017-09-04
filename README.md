
## **MultiFontView**

[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16)
[![](https://jitpack.io/v/shashkiranr/MultiFontView-Android.svg)](https://jitpack.io/#shashkiranr/MultiFontView-Android)

**`MultiFontView`** library can be used to select custom fonts for the view dynamically in your XML. The library loads the custom fonts using a font cache. 

**Views Available**

`MultiFontTextView`
`MultiFontEditText`
`MultiFontButton`
`MultiFontSwitch`
`MultiFontRadioButton`
`MultiFontCheckBox`
`MultiFontTextClock[API 17+]`

![](https://github.com/shashkiranr/MultiFontView-Android/blob/master/Screenshot.png?raw=true)

## **How to Use**

#### *STEP 1 - Declare dependencies in your project*

To add any `MultiFontView` to your project, first make sure in root `build.gradle` you have specified the following repository:
```groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

To Use MultiFont Textview, add the below dependency
 
```groovy
	dependencies {
	        compile 'com.github.shashkiranr.MultiFontView-Android:multifonttextview:1.7'
	}
```

To Use MultiFont Button, add the below dependency
 
```groovy
	dependencies {
	        compile 'com.github.shashkiranr.MultiFontView-Android:multifontbutton:1.7'
	}
```

To Use MultiFont EditText, add the below dependency
 
```groovy
	dependencies {
	       compile 'com.github.shashkiranr.MultiFontView-Android:multifontedittext:1.7'
	}
```
To Use MultiFont Switch, add the below dependency
 
```groovy
	dependencies {
	       compile 'com.github.shashkiranr.MultiFontView-Android:multifontswitch:1.7'
	}
```

To Use MultiFont CheckBox, add the below dependency
 
```groovy
	dependencies {
	       compile 'com.github.shashkiranr.MultiFontView-Android:multifontcheckbox:1.7'
	}
```

To Use MultiFont RadioButton, add the below dependency
 
```groovy
	dependencies {
	       compile 'com.github.shashkiranr.MultiFontView-Android:multifontradiobutton:1.7'
	}
```

To Use MultiFont TextClock, add the below dependency
 
```groovy
	dependencies {
	       compile 'com.github.shashkiranr.MultiFontView-Android:multifonttextclock:1.7'
	}
```

#### *STEP 2 - copy the fonts to assets folder under fonts subfolder*

![](https://github.com/shashkiranr/MultiFontView-Android/blob/master/Screenshot%20-%20assets.png?raw=true)
 
 
#### *STEP 3 - create an attrs.xml file (if already present then add) a declare-stylable and attribute name typeface_from_list which contains the custom fonts in form of enums -  as shown below*

For `MultiFontTextView` the declare-styleable should be named `MultiFontTextView` and attribute should be named `typeface_from_list`

```groovy
<attr name="typeface_from_list">
        <enum name="BLESSED.otf" value="0" />
        <enum name="Respective.ttf" value="1" />
        <enum name="Respective_Slanted.ttf" value="2" />
        <enum name="Shine.ttf" value="3" />
        <enum name="SweetSensations.ttf" value="4" />
    </attr>
    <declare-styleable name="MultiFontTextView">
        <attr name="typeface_from_list" />
    </declare-styleable>
```

For `MultiFontButton` the declare-styleable should be named `MultiFontButton` and attribute should be named `typeface_from_list`

```groovy
<attr name="typeface_from_list">
        <enum name="BLESSED.otf" value="0" />
        <enum name="Respective.ttf" value="1" />
        <enum name="Respective_Slanted.ttf" value="2" />
        <enum name="Shine.ttf" value="3" />
        <enum name="SweetSensations.ttf" value="4" />
    </attr>
    <declare-styleable name="MultiFontButton">
        <attr name="typeface_from_list" />
    </declare-styleable>
```

For `MultiFontEditText` the declare-styleable should be named `MultiFontEditText` and attribute should be named `typeface_from_list`

```groovy
<attr name="typeface_from_list">
        <enum name="BLESSED.otf" value="0" />
        <enum name="Respective.ttf" value="1" />
        <enum name="Respective_Slanted.ttf" value="2" />
        <enum name="Shine.ttf" value="3" />
        <enum name="SweetSensations.ttf" value="4" />
    </attr>
    <declare-styleable name="MultiFontEditText">
        <attr name="typeface_from_list" />
    </declare-styleable>
```

For `MultiFontSwitch` the declare-styleable should be named `MultiFontSwitch` and attribute should be named `typeface_from_list`

```groovy
<attr name="typeface_from_list">
        <enum name="BLESSED.otf" value="0" />
        <enum name="Respective.ttf" value="1" />
        <enum name="Respective_Slanted.ttf" value="2" />
        <enum name="Shine.ttf" value="3" />
        <enum name="SweetSensations.ttf" value="4" />
    </attr>
    <declare-styleable name="MultiFontSwitch">
        <attr name="typeface_from_list" />
    </declare-styleable>
```

For `MultiFontRadioButton` the declare-styleable should be named `MultiFontRadioButton` and attribute should be named `typeface_from_list`

```groovy
<attr name="typeface_from_list">
        <enum name="BLESSED.otf" value="0" />
        <enum name="Respective.ttf" value="1" />
        <enum name="Respective_Slanted.ttf" value="2" />
        <enum name="Shine.ttf" value="3" />
        <enum name="SweetSensations.ttf" value="4" />
    </attr>
    <declare-styleable name="MultiFontRadioButton">
        <attr name="typeface_from_list" />
    </declare-styleable>
```

For `MultiFontCheckBox` the declare-styleable should be named `MultiFontCheckBox` and attribute should be named `typeface_from_list`

```groovy
<attr name="typeface_from_list">
        <enum name="BLESSED.otf" value="0" />
        <enum name="Respective.ttf" value="1" />
        <enum name="Respective_Slanted.ttf" value="2" />
        <enum name="Shine.ttf" value="3" />
        <enum name="SweetSensations.ttf" value="4" />
    </attr>
    <declare-styleable name="MultiFontCheckBox">
        <attr name="typeface_from_list" />
    </declare-styleable>
```

For `MultiFontTextClock` the declare-styleable should be named `MultiFontCheckBox` and attribute should be named `typeface_from_list`

```groovy
<attr name="typeface_from_list">
        <enum name="BLESSED.otf" value="0" />
        <enum name="Respective.ttf" value="1" />
        <enum name="Respective_Slanted.ttf" value="2" />
        <enum name="Shine.ttf" value="3" />
        <enum name="SweetSensations.ttf" value="4" />
    </attr>
    <declare-styleable name="MultiFontTextClock">
        <attr name="typeface_from_list" />
    </declare-styleable>
```

If you are using `all the views` or `any two views` just one typeface_from_list is enough as shown below
```groovy
   <attr name="typeface_from_list">
        <enum name="BLESSED.otf" value="0" />
        <enum name="Respective.ttf" value="1" />
        <enum name="Respective_Slanted.ttf" value="2" />
        <enum name="Shine.ttf" value="3" />
        <enum name="SweetSensations.ttf" value="4" />
    </attr>
    <declare-styleable name="MultiFontTextView">
        <attr name="typeface_from_list" />
    </declare-styleable>

    <declare-styleable name="MultiFontButton">
        <attr name="typeface_from_list" />
    </declare-styleable>

    <declare-styleable name="MultiFontEditText">
        <attr name="typeface_from_list" />
    </declare-styleable>
    
    <declare-styleable name="MultiFontSwitch">
        <attr name="typeface_from_list" />
    </declare-styleable>

    <declare-styleable name="MultiFontRadioButton">
        <attr name="typeface_from_list" />
    </declare-styleable>

    <declare-styleable name="MultiFontCheckBox">
        <attr name="typeface_from_list" />
    </declare-styleable>
    
    <declare-styleable name="MultiFontTextClock">
        <attr name="typeface_from_list" />
    </declare-styleable>
    
```

#### *STEP 4 - create a string array with name `customFonts` and declare all the name of the custom fonts with file extension in the `same order` as `typeface_from_list` enum-  as shown below*

```groovy
    <string-array name="customFonts">
        <item>BLESSED.otf</item>
        <item>Respective.ttf</item>
        <item>Respective_Slanted.ttf</item>
        <item>Shine.ttf</item>
        <item>SweetSensations.ttf</item>
    </string-array>
```

#### *STEP 5 - Add the custom view in your layout. The property `typeface_from_list` should apper and the font names should display as values as shown below*

![](https://github.com/shashkiranr/MultiFontView-Android/blob/master/Screenshot%20MultiFontTextview.png?raw=true)

![](https://github.com/shashkiranr/MultiFontView-Android/blob/master/Screenshot%20MultiFontButton.png?raw=true)

![](https://github.com/shashkiranr/MultiFontView-Android/blob/master/Screenshot%20MultifontEditText.png?raw=true)

![](https://github.com/shashkiranr/MultiFontView-Android/blob/master/Screenshot%20MultiFontSwitch.png?raw=true)

![](https://github.com/shashkiranr/MultiFontView-Android/blob/master/Screenshot%20MultiFontRadioButton.png?raw=true)

![](https://github.com/shashkiranr/MultiFontView-Android/blob/master/Screenshot%20MultiFontCheckBox.png?raw=true)

![](https://github.com/shashkiranr/MultiFontView-Android/blob/master/Screenshot%20MultiFontTextClock.png?raw=true)



## ***Thats it !!***

## **License**

    MIT License

    Copyright (c) 2017 shashkiranr

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.

