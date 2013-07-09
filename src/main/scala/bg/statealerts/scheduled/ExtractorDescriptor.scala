package bg.statealerts.scheduled

case class ExtractorDescriptor(
  extractorType: String,
  titlePath: Option[String],
  contentPath: Option[String],
  dateFormat: Option[String],
  datePath: Option[String],
  url: String,
  paginationUrl: String,
  documentLinkPath: Option[String]) {
}