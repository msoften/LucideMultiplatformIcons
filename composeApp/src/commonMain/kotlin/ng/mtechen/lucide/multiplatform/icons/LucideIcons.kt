package ng.mtechen.lucide.multiplatform.icons

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ng.mtechen.lucide.multiplatform.icons.resources.homeIcon

/**
 * Lucide icons implementation for Compose Multiplatform
 */
object LucideIcons {
    val home = homeIcon()

    fun home(size: Int = 24, color: Color = Color.Black) = homeIcon(size, color)

    /**
     * A composable function to render the home icon directly.
     * This uses the provided size, color, and optional content description.
     */
    @Composable
    fun home(
        size: Int = 24,
        color: Color = Color.Black,
        contentDescription: String? = null
    ) {
        Icon(
            imageVector = home(size, color), // Reuse the home function
            contentDescription = contentDescription ?: "Home",
            tint = Color.Unspecified, // Ensures the color from ImageVector is used
            modifier = Modifier.size(size.dp) // Apply size
        )
    }
 }
