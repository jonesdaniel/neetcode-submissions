data class WebPage(
    var url: String,
    var prev: WebPage? = null,
    var next: WebPage? = null
)

class BrowserHistory(homepage: String) {
    private var currentPage = WebPage(url = homepage)

    fun visit(url: String) {
        currentPage.next = WebPage(
            url = url,
            prev = currentPage,
            next = null
        )
        currentPage = currentPage.next!!
    }

    fun back(steps: Int): String {
        var remainingSteps = steps
        while (currentPage.prev != null && remainingSteps > 0) {
            currentPage = currentPage.prev!!
            remainingSteps--
        }
        return currentPage.url
    }

    fun forward(steps: Int): String {
        var remainingSteps = steps
        while (currentPage.next != null && remainingSteps > 0) {
            currentPage = currentPage.next!!
            remainingSteps--
        }
        return currentPage.url
    }

}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * var obj = BrowserHistory(homepage)
 * obj.visit(url)
 * var param_2 = obj.back(steps)
 * var param_3 = obj.forward(steps)
 */