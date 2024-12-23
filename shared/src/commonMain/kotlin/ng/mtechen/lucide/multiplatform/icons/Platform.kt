package ng.mtechen.lucide.multiplatform.icons

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform