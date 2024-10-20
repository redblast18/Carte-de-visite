package com.example.cartedevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartedevisite.ui.theme.CarteDeVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteDeVisiteTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    CarteVisite()
                }
            }
        }
    }
}

@Composable
fun CarteVisite() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Bloc d'informations principales
        Box(
            modifier = Modifier
                .fillMaxSize(0.8f)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .size(170.dp)
                ) {
                    val imageLogo = painterResource(R.drawable.android_logo)
                    Image(
                        painter = imageLogo,
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Text(
                    text = "Full Name",
                    modifier = Modifier.padding(2.dp)
                )
                Text(
                    text = "Title",
                    modifier = Modifier.padding(2.dp)
                )
            }
        }

        // Bloc des contacts centré horizontalement
        Box(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .align(Alignment.CenterHorizontally)
                .padding(2.dp),
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ContactRow("Phone Number", "+00 (00) 000 000")
                ContactRow("Social Media", "@socialmediahandle")
                ContactRow("Email", "email@domain.com")
            }
        }
    }
}

@Composable
fun ContactRow(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = value,
            fontSize = 14.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CarteVisitePreview() {
    CarteDeVisiteTheme {
        CarteVisite()
    }
}
