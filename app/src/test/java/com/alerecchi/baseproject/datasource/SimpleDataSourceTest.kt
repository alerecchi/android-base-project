package com.alerecchi.baseproject.datasource


class SimpleDataSourceTest {

    /*

    @get:Rule
    val instantLiveData: TestRule = InstantTaskExecutorRule()
    @get:Rule
    val instantRx: TestRule = RxImmediateSchedulerRule()
    @get:Rule
    val errorsRx: TestRule = RxErrorsRule()





    private val netModule = NetworkModule()
    private val mockWebServer = MockWebServer()
    private val retrofit = netModule.providesRetrofit(OkHttpClient(), Gson())
    private val service = netModule.providesSimpleService(retrofit)
    private val dataSource = SimpleDataSource(service)

    @After
    fun tearDown() {
        mockWebServer.shutdown()
    }

    @Test
    fun getSquareReposTest() {
        val expectedModel = GitHubRepo(
            230958,
            "html5",
            "square/html5",
            "https://github.com/square/html5",
            "A Rails plugin for playing around with HTML5.",
            Date(1245360164000),
            Date(1534396172000),
            9,
            License("MIT License", "https://api.github.com/licenses/mit"),
            9,
            false
        )
        mockWebServer.enqueue(MockResponse().setResponseCode(200).setBody(JsonUtils.getJson("json/githubResponse.json")))
        val repositories = dataSource.getSquareRepos().blockingGet()

        assertThat(repositories).isNotNull
        assertThat(repositories).hasSize(30)
        assertThat(repositories[0]).isEqualTo(expectedModel)
    }*/
}