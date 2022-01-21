package spp.protocol.processor

enum class ProcessorAddress(val address: String) {
    LOGGING_PROCESSOR("sw.processor.logging"),
    LIVE_VIEW_PROCESSOR("sw.processor.live-view"),
    LIVE_INSTRUMENT_PROCESSOR("sw.processor.live-instrument"),
    LIVE_AUDIT_PROCESSOR("sw.processor.live-audit"),
    BREAKPOINT_HIT("spp.provider.status.breakpoint-hit"),
    LOG_HIT("spp.provider.status.log-hit"),
    SET_LOG_PUBLISH_RATE_LIMIT("spp.provider.setting.log-publish-rate-limit");
}
