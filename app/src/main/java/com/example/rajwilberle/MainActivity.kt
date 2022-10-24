package com.example.rajwilberle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rajwilberle.ui.theme.RAJWilberLETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RAJWilberLETheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    // funcion
                    RA_JW()
                }
            }
        }
    }
}
@Composable
fun RA_JW(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .border(2.dp, color = Color.Black)
    ) {

        Box(
            modifier = Modifier
                .padding(top = 6.dp, start = 6.dp, end = 6.dp, bottom = 5.dp)
                    .background(color = Color(0xFF03645F))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "IMSS Digital",
                    modifier = Modifier
                        .padding(top = 10.dp, start = 20.dp)
                        .align(Alignment.TopStart),
                    fontSize = 30.sp, color = Color.White,
                    fontWeight = FontWeight(900)
                )
                Text(
                    text = "Bienvenido",
                    modifier = Modifier
                        .padding(
                            top = 52.dp,
                            bottom = 10.dp,
                            start = 20.dp
                        )
                        .align(Alignment.BottomStart),
                    fontSize = 20.sp,
                    fontWeight = FontWeight(300),
                    color = Color.White
                )
                Text(
                    text = "Consulta", modifier = Modifier
                        .padding(top = 10.dp, end = 25.dp)
                        .align(
                            Alignment.TopEnd
                        ), fontSize = 21.sp, fontWeight = FontWeight(300), color = Color.White
                )
                Text(
                    text = "NSS",
                    modifier = Modifier
                        .width(80.dp)
                        .padding(top = 40.dp, end = 30.dp)
                        .clip(
                            CircleShape
                        )
                        .align(Alignment.CenterEnd)
                        .background(Color.White),
                    fontSize = 20.sp,
                    fontWeight = FontWeight(900),
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
            }
        }
        Column(
            modifier = Modifier.paddingFromBaseline(top = 205.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .paddingFromBaseline(top = 10.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Card(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.pulmones),
                            contentDescription = "img1",
                            modifier = Modifier.size(60.dp)
                        )
                        Text(
                            text = "Modulo Atencion Respiratoria (MARSS)",
                            modifier = Modifier
                                .width(180.dp)
                                .height(75.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
                Card(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.rirus),
                            contentDescription = "img2",
                            modifier = Modifier
                                .size(60.dp)
                        )
                        Text(
                            text = "Permiso COVID 4.0",
                            modifier = Modifier
                                .width(180.dp)
                                .height(75.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .paddingFromBaseline(top = 100.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Card(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.calendario),
                            contentDescription = "img3",
                            modifier = Modifier.size(60.dp)
                        )
                        Text(
                            text = "Cita Medica Familiar",
                            modifier = Modifier
                                .width(180.dp)
                                .height(70.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
                Card(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.corazonlatidos),
                            contentDescription = "img4",
                            modifier = Modifier.size(60.dp)
                        )
                        Text(
                            text = "CHKT en Linea",
                            modifier = Modifier
                                .width(180.dp)
                                .height(70.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .paddingFromBaseline(top = 100.dp)
            ) {
                Card(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vigenciaderecho),
                            contentDescription = "img5",
                            modifier = Modifier
                                .size(70.dp)
                        )
                        Text(
                            text = "Vigencia de Derechos",
                            modifier = Modifier
                                .width(180.dp)
                                .height(60.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
                Card(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.gps),
                            contentDescription = "img6",
                            modifier = Modifier
                                .size(60.dp)
                        )
                        Text(
                            text = "Alta o Cambio de Clinica",
                            modifier = Modifier
                                .width(180.dp)
                                .height(70.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .paddingFromBaseline(top = 100.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Card(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.informantefamiliar),
                            contentDescription = "img7",
                            modifier = Modifier
                                .size(60.dp)
                        )
                        Text(
                            text = "Inforamante de tu Familiar",
                            modifier = Modifier
                                .width(180.dp)
                                .height(70.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
                Card(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.osito),
                            contentDescription = "ima1",
                            modifier = Modifier.size(60.dp)
                        )
                        Text(
                            text = "Licencia 140 Bis",
                            modifier = Modifier
                                .width(180.dp)
                                .height(70.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            Spacer(
                modifier = Modifier
                    .padding(bottom = 10.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.casa),
                        contentDescription = "img9",
                        modifier = Modifier
                            .size(80.dp)
                            .align(Alignment.CenterStart)
                            .padding(start = 40.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.location),
                        contentDescription = "img11",
                        modifier = Modifier
                            .size(40.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.calendar),
                        contentDescription = "img12",
                        modifier = Modifier
                            .size(110.dp)
                            .align(Alignment.CenterEnd)
                            .padding(40.dp)
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RAJWilberLETheme {
        // funcion
        RA_JW()
    }
}