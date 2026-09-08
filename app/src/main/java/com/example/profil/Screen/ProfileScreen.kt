package com.example.profil.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profil.R

@Composable
fun ProfileScreen() {
    val scrollState = rememberScrollState()

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.verticalScroll(scrollState)) {
            // 1. Banner Atas + Foto Profil
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp)
            ) {
                // Banner Background
                Image(
                    painter = painterResource(id = R.drawable.bg),
                    contentDescription = "Cover Banner",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(130.dp)
                        .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                )

                // Avatar Profil
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Foto Profil",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .offset(x = 16.dp, y = 36.dp)
                        .size(72.dp)
                        .clip(CircleShape)
                        .border(3.dp, Color.White, CircleShape)
                )
            }

            // 2. Identitas
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 44.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Najwan Syauqi",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1E2432)
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Mobile App Developer",
                        fontSize = 14.sp,
                        color = Color(0xFF909BB0)
                    )
                }
            }

            // 3. Deskripsi
            Text(
                text = "Mobile App Developer specializing in Android development with Kotlin & Jetpack Compose. Passionate about writing clean code, modular architecture, and crafting fluid user experiences.",
                fontSize = 14.sp,
                color = Color(0xFF555F70),
                lineHeight = 20.sp,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp)
            )

            // 4. Info Card (Location, Job Type, Experience)
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFF8FAFC)),
                elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 14.dp)
                        .height(IntrinsicSize.Min),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Location", color = Color(0xFF909BB0), fontSize = 13.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "MLG", fontWeight = FontWeight.Bold, fontSize = 15.sp, color = Color(0xFF1E2432))
                    }

                    Box(
                        modifier = Modifier
                            .width(1.dp)
                            .fillMaxHeight()
                            .background(Color(0xFFE5E9F0))
                    )

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Job Type", color = Color(0xFF909BB0), fontSize = 13.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "Part Time", fontWeight = FontWeight.Bold, fontSize = 15.sp, color = Color(0xFF1E2432))
                    }

                    Box(
                        modifier = Modifier
                            .width(1.dp)
                            .fillMaxHeight()
                            .background(Color(0xFFE5E9F0))
                    )

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Experience", color = Color(0xFF909BB0), fontSize = 13.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = "2 years", fontWeight = FontWeight.Bold, fontSize = 15.sp, color = Color(0xFF1E2432))
                    }
                }
            }

            // 5. Informasi Kontak
            Text(
                text = "Information",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1E2432),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(top = 8.dp, bottom = 12.dp)
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                ContactItem(
                    icon = Icons.Outlined.Phone,
                    label = "PHONE",
                    value = "+62129873712"
                )
                ContactItem(
                    icon = Icons.Outlined.Email,
                    label = "EMAIL",
                    value = "najwanGaming@gmail.com"
                )
                ContactItem(
                    icon = Icons.Outlined.LocationOn,
                    label = "ADDRESS",
                    value = "Jl. Merpati indah kusuma"
                )
            }

            // 6. Experience
            Text(
                text = "My Experience",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1E2432),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(top = 8.dp, bottom = 12.dp)
            )

            ExperienceCard(
                title = "Android Developer",
                company = "Tech Solution Studio",
                jobType = "Part Time",
                period = "2022-Sekarang"
            )
            Spacer(modifier = Modifier.height(8.dp))
            ExperienceCard(
                title = "Junior Mobile Developer",
                company = "Digital Inovasi Nusantara",
                jobType = "Full Time",
                period = "2021-2022"
            )
        }
    }
}

@Composable
fun ExperienceCard(
    title: String,
    company: String,
    jobType: String,
    period: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF8FAFC)),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = title,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1E2432)
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = company,
                        fontSize = 13.sp,
                        color = Color(0xFF909BB0)
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = jobType,
                    fontSize = 13.sp,
                    color = Color(0xFF909BB0)
                )
                Text(
                    text = period,
                    fontSize = 13.sp,
                    color = Color(0xFF909BB0)
                )
            }
        }
    }
}

@Composable
fun ContactItem(
    icon: ImageVector,
    label: String,
    value: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(44.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFFF4F6F9)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = label,
                tint = Color(0xFF555F70),
                modifier = Modifier.size(20.dp)
            )
        }

        Spacer(modifier = Modifier.width(14.dp))

        Column {
            Text(
                text = label,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF909BB0)
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = value,
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF1E2432)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfil() {
    ProfileScreen()
}