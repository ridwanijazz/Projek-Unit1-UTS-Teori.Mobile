package lat.pam.projek_unit1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.material3.icons.Icons
//import androidx.compose.material3.icons.filled.Email
//import androidx.compose.material3.icons.filled.Phone
//import androidx.compose.material3.icons.filled.Share

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardScreen()
        }
    }
}

@Composable
fun BusinessCardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD5E4DA)) // Warna latar belakang
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        LogoSection()
        Spacer(modifier = Modifier.height(24.dp))
        NameTitleSection()
        Spacer(modifier = Modifier.height(24.dp))
        ContactInfoSection()
    }
}

@Composable
fun LogoSection() {
    Image(
        painter = painterResource(R.drawable.ic_launcher_foreground), // Ganti dengan logo Android yang sesuai
        contentDescription = "Android Logo",
        modifier = Modifier.size(100.dp)
    )
}

@Composable
fun NameTitleSection() {
    Text(
        text = "Muhammad Saifurridwani 'Ijazi",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
    Text(
        text = "Teknik Informatika",
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        color = Color(0xFF4CAF50)
    )
}

@Composable
fun ContactInfoSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ContactRow(icon = Icons.Default.Phone, contactText = "08212131345")
        ContactRow(icon = Icons.Default.Share, contactText = "@ridwanijazz")
        ContactRow(icon = Icons.Default.Email, contactText = "m.saifurridwani@gmail.com")
    }
}

@Composable
fun ContactRow(icon: androidx.compose.ui.graphics.vector.ImageVector, contactText: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 4.dp)
    ) {
        Icon(icon, contentDescription = null, tint = Color(0xFF4CAF50), modifier = Modifier.size(24.dp))
        Spacer(modifier = Modifier.width(8.dp))
        Text(contactText, fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBusinessCard() {
    BusinessCardScreen()
}
