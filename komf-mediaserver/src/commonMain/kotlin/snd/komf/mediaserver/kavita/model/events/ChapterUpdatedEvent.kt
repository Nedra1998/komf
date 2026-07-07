package snd.komf.mediaserver.kavita.model.events

data class ChapterUpdatedEvent(
    val body: Body,
    val name: String?,
    val title: String?,
    val subTitle: String?,
    val eventType: String?,
    val progress: String?,
) {

    data class Body(
        val seriesId: Int,
        val chapterId: Int,
    )
}
