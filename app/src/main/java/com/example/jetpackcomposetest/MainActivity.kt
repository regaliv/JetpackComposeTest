package com.example.jetpackcomposetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clipScrollableContainer
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetest.ui.theme.JetpackComposeTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                ListItem(name = "Alex", prof = "Coding")
                ListItem(name = "Alex", prof = "Coding")
                ListItem(name = "Alex", prof = "Coding")
                ListItem(name = "Alex", prof = "Coding")
                ListItem(name = "Alex", prof = "Coding")
                ListItem(name = "Alex", prof = "Coding")


            }


                }

            }
        }
@Composable
private fun ListItem(name:String, prof:String){

        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
             shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(5.dp)
        ){Box(modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth(),
            contentAlignment = Alignment.Center){
                    Row(verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .background(Color.Green))
                    {
                        Image(painter = painterResource(id = R.drawable.aaa),
                            contentDescription = "image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .padding(5.dp)
                                .size(60.dp)
                                .clip(CircleShape)

                        )
                        Column(modifier = Modifier

                            .padding(start = 16.dp)) {
                            Text(text = name)
                            Text(text = prof)
                        }


                    }
        } }

}
