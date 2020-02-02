@file:JsQualifier("chrome.tabs")

package chrome.tabs

external fun query(queryInfo: QueryInfo, callback: (Array<Tab>) -> Unit)

external fun executeScript(
    tabId: Int? = definedExternally,
    details: ExecuteScriptDetails,
    callback: ((Array<dynamic>) -> Unit)? = definedExternally
)


external interface QueryInfo {
    var active: Boolean?
    var pinned: Boolean?
    var audible: Boolean?
    var muted: Boolean?
    var highlighted: Boolean?
    var discarded: Boolean?
    var autoDiscardable: Boolean?
    var currentWindow: Boolean?
    var lastFocusedWindow: Boolean?
    var status: String?
    var title: String?
    var url: String?
    var windowId: Int?
    var windowType: String?
    var index: Int?
}

external interface Tab {
    var id: Int?
    var index: Int?
    var windowId: Int?
    var openerTabId: Int?
    var selected: Boolean?
    var highlighted: Boolean?
    var active: Boolean?
    var pinned: Boolean?
    var audible: Boolean?
    var discarded: Boolean?
    var autoDiscardable: Boolean?
    var url: String?
    var pendingUrl: String?
    var title: String?
    var favIconUrl: String?
    var status: String?
    var incognito: Boolean?
    var width: Int?
    var height: Int?
    var sessionId: String?
}

external interface ExecuteScriptDetails {
    var code: String?
    var file: String?
    var allFrames: Boolean?
    var frameId: Int?
    var matchAboutBlank: Boolean?
    var runAt: String?
    var cssOrigin: String?
}
