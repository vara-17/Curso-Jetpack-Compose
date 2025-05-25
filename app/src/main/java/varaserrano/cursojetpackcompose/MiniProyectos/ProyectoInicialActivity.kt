package varaserrano.cursojetpackcompose.MiniProyectos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ProyectoInicialActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }
}

val colors = listOf(
    Color.Red,
    Color.Blue,
    Color.Green,
    Color.Yellow,
    Color.Black,
    Color.Gray,
    Color.Magenta,
    Color.Cyan
)
val nombre = "Me gusta"


@Preview(showBackground = true)
@Composable
fun Content() {
    var count by remember { mutableStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
            .padding(horizontal = 5.dp)
    ) {
        Texto(texto = "Hola")
        Space()
        Texto(texto = "Jetpack Compose")
        Space()
        Texto(texto = "Curso Jetpack Compose")
        Space()
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            items(colors) { color ->
                Circulo(color = color)
                Spacer(modifier = Modifier.size(10.dp))
            }
        }
        Space()
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { count++ }) {
                Text(text = nombre)
            }
            Spacer(modifier = Modifier.size(10.dp))
            Resultado(likes = count)
        }
    }
}

@Composable
fun Circulo(color: Color) {
    Box(
        modifier = Modifier
            .size(70.dp)
            .background(color, CircleShape)
    )
}

@Composable
fun Resultado(likes: Int) {
    Text(
        text = likes.toString(),
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        color = Color.Blue
    )
}

@Composable
fun Texto(texto: String) {
    Text(
        text = texto,
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(Color.Black)
            .padding(horizontal = 30.dp)
            .fillMaxWidth()
            .clickable { println("Hola Jetpack") }
    )
}

@Composable
fun Space() {
    Spacer(modifier = Modifier.height(5.dp))
}