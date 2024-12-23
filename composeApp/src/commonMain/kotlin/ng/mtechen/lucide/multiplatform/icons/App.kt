package ng.mtechen.lucide.multiplatform.icons

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import lucidemultiplatformicons.composeapp.generated.resources.Res
import lucidemultiplatformicons.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        // Test icon
        Icon(
            imageVector = LucideIcons.home(),
            contentDescription = "Home",
            tint = MaterialTheme.colors.primary,
            modifier = Modifier.size(24.dp)
        )
    }
}