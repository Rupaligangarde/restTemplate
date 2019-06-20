package restTemplateClientExample.service


import org.junit.Assert
import org.junit.Test

import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner::class)
class ApiServiceImplTest {

    @Autowired lateinit var apiService: apiService

    @Test
    fun testGetRepos()  {
        val repos = apiService.getRepos()
        Assert.assertEquals(repos.size, 11)
    }
}