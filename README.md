# kotling_android_basic

# Basic Event Listener Application 

```kotlin
package com.example.firstkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_click_me = findViewById(R.id.button) as Button
        val myTextView = findViewById(R.id.textView) as TextView
        var timesClicked = 0

        // set on-click listener
        btn_click_me.setOnClickListener {
            timesClicked = timesClicked + 1
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "You clicked Me", Toast.LENGTH_SHORT).show()

        }

    }
}
```


# Variables & DataType

### variables

- val, immutable variable 
- var, mutable variable

### datatype

- byte, short, Int, Long
- char, String 

char can be represented with single quotation mark. `'a'`

String can be represented with double quotation mark, `"abc"`
