package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

data class Person(val name: String, val surname: String, val adress: String,val telephone: String)
class MainActivity : ComponentActivity() {
    companion object {
        val defaultPerson = Person("Przemysław", "Stokłosa", "Bielsko-Biała", telephone = "12345533")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, EditData::class.java)
        startActivity(intent)

        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ShowMessage(defaultPerson)
                }
            }
        }
    }
}



@Composable
fun ShowMessage(person: Person, modifier: Modifier = Modifier) {
    Column {
        Row() {
            Text(
                text = person.name, modifier = Modifier.padding(all = 4.dp)
            )
            Text(
                text = person.surname, modifier = Modifier.padding(all = 4.dp)
            )
        }
        Row() {
            Text(text = person.adress, modifier = Modifier.padding(all = 4.dp))
        }
        Row() {
            Text(text = person.telephone, modifier = Modifier.padding(all = 4.dp))
        }
        Row(){
            Button(onClick = {

            }) {
                Text(text = "Zmień dane")

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        ShowMessage(MainActivity.defaultPerson)
    }
}