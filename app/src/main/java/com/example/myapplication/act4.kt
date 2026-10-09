package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@composable
fun ActivitasPertama(modifier: Modifier, cardColors: Nothing?.(Long, Any?) -> Unit){
    column(
        modifier = Modifier.padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            stringResource(id=R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(id = R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(25.dp))

        val cardDefaults = null
        card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = cardDefaults.cardColors(
                ContainerColor = colorResource(id = R.color.card_0_bg)
            )

            {
                Row(){
                    val gambar = painterResource(id = R.drawable.img)
                    Image(
                        painter = gambar,
                        contentDescruption = null,
                        modifier = Modifier.size(100.dp).padding(all = 5.dp)
                    )

                    spacer(modifier = Modifier.width(30.dp))
                    Column(){
                        Text(
                            stringResource("Derek Dzakir Cadudasa"),
                            fontSize = 30.sp,
                            fontFamily = FontFamily.Cursive,
                            color = Color.White,
                            modifier = Modifier.padding(top = 15.dp)
                        )

                        Text(
                            stringResource("Malang, Amsterdam"),
                            fontSize = 20.sp,
                            color = Color.Yellow,
                            modifier = Modifier.padding(top = 10.dp)
                        )
                    }

                }
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                )
            }

        )
    }
}