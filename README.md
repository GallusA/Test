# Test
1-set of commands to push and repo on Github
git remote add origin git@github.com:username/reponame.git

2-strings.xml in the project structure
In the res folder
3-What is the difference between SP and DP?

4-How can you support multiple languages in your app? Explain step by step process.

To support multiple language in your app, you need to go through the followings steps:
a-open res 
b-open values
c-create a new string.xml with the new language name by right clicking and selecting New Resource File, put the name of the new language, then select string under source set, follow by locale under Available qualifiers, follow by the name of the wanted language.
d-copy <string name="app_name">Test</string>  from  resources strings.xml  and paste it in the new strings created. The replace Test by the equivalent name in the language selected.
Then sync and retsart.

5-What is the difference between match_parent and wrap_content?
match_parent match length or the width that the parent has and wrap_content just refer the default size of the cell.
6-How can you setup a method for a button click without binding the view?
 By referring to onClick on the layout where the bottom is created, "android:onClick="ogToCamera";
7-How can you define a button click method with binding the button view?
The button click method with binding the button view involve the notion implementing the the clads OnClickListener.
8-How can you change the color of the TextView?
By using on the layout android:textColor" value"
9_Where are all the colors in the android architecture saved?

In the main layout.
10.	How would you add a different layout for a landscape and a language? Name the qualifiers.

11.	How would you make the keyboard hide for EditText when the activity is created?
 12.	What are ViewGroups and Views?
GroupView  allow to put many view together.
13.	What attribute is necessary in a linear layout if there are more than one child views?
   Orientation"vertical"
14.	In which case you would use a Linear layout and a Relative layout?
     Linear when you want the element to fit a particular spot
 Relative when, you when the screen to adjust by itself.
15.	How would you load an image in a ImageView from xml and programmatically?
By using drawable repository
16.	List all the states in an activity lifecycle.
OnCreate, OnStart, OnResume, OnPause,OnStop,OnRestart,OnDistroy
17.	What is the lifecycle of activity one and activity two when we go to activity one from two?
      Activity One will call Activity Two when it is necessary
18.	How to restrict an activity from changing the orientation?
       By 
19.	Which method is called to persist the data before the activity is destroyed?
         OnSave Method
20.	What is the argument of that method?
                  Intent 
21.	How do we save the data in the method?
                   By Reference, Database, file or cloud
22.	How to get that data back? What is the name of the method?
           Calling Intent method
23.	What is a bundle? What can a bundle contain?

24.	What is the difference between onPause and onStop?
         OnPause still have a partial activity while on OnStop the activity is gone.
25.	How to start an activity for getting a result back?
            onCreate Method
26.	Which callback is used get the result back in the above case?
     use Tag method
27.	What are difference types of Intent? What are the difference between them? When do we use each of them?
  We explicite(you definite target) and implicte (you don't me to define the target)
28.	How to communicate data between activities?
       Broadcast received is used
29.	How to add data to an intent?
             Intent intent = new Intent(this, Activity.class)

30.	What kind of data can be added to an intent?
        String 
            By using Intent Metthod
31.	How to get the data sent from activity one in activity two?
        By calling Intent method
32.	What is context?
            Is the environment
33.	Name different kinds of layouts in Android?
              Relative, Linear, TextView,ImageView,WebView,Button
34.	How to send an object through an Intent?
                
35.	What is Serializable?
         Transferring data  by making a copy, java base.
36.	What is Parcelable?
Transferring data without making a copy, therefore, is faster
37.	Which is better and why?
Parcealable
38.	How can an object class be Serializable or Parcelable? Explain in detail the methods to implement if any?
 
39.	Can we avoid implementing methods using Parcelable?
         
40.	What are launch modes? Explain each one of them in detail.

41.	What is back stack?
          It using a single instance
42.	How to we create a .apk file?
             
43.	How to create and signed .apk file
