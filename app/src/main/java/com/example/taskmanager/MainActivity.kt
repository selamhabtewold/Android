package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.taskmanager.ui.theme.TaskManagerTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskManage(status = "All tasks completed", message = "Nice work!")

                }
            }
        }
    }
}


@Composable
fun TaskManage(status: String, message : String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center

    ) {
        Image(
            painter = image,
            contentDescription = null

        )
        Greeting(status = "All tasks completed", message = "Nice work!")
    }

}
@Composable
fun Greeting(status: String, message : String, modifier: Modifier = Modifier) {
    Text(
        text = status,
        modifier = Modifier.padding(16.dp),
        fontWeight = FontWeight.Bold,

    )
    Text(
        text = message,
        fontSize = 16.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(16.dp),

        )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        TaskManage(status = "All tasks completed", message = "Nice work!")
    }
}