package ng.mtechen.lucide.multiplatform.icons.resources

/**
 * Home icon implementation for Compose Multiplatform
 *
 * @param size Icon size in dp (default: 24.dp)
 * @param color Icon color (default: Color.Black)
 */
fun Home(size: Int = 24, color: Color = Color.Black): ImageVector {
    return ImageVector.Builder(
        name = "home",
        defaultWidth = size.dp,
        defaultHeight = size.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = SolidColor(Color.Transparent),
            stroke = SolidColor(color),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            // SVG path data for home icon
            moveTo(3f, 9f)
            lineTo(12f, 2f)
            lineTo(21f, 9f)
            verticalLineTo(20f)
            curveTo(21f, 20.5304f, 20.7893f, 21.0391f, 20.4142f, 21.4142f)
            curveTo(20.0391f, 21.7893f, 19.5304f, 22f, 19f, 22f)
            horizontalLineTo(5f)
            curveTo(4.46957f, 22f, 3.96086f, 21.7893f, 3.58579f, 21.4142f)
            curveTo(3.21071f, 21.0391f, 3f, 20.5304f, 3f, 20f)
            verticalLineTo(9f)
            close()
        }
        // Door
        path(
            fill = SolidColor(Color.Transparent),
            stroke = SolidColor(color),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9f, 22f)
            verticalLineTo(12f)
            horizontalLineTo(15f)
            verticalLineTo(22f)
        }
    }.build()
}
