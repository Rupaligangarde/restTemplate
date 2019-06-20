package restTemplateClientExample.service

import restTemplateClientExample.model.Repo
import restTemplateClientExample.model.RepoData
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@Service
class ApiServiceImpl(private val restTemplate: RestTemplate) : apiService {

    override fun getRepos(): List<Repo> {
        return restTemplate.getForObject("https://api.github.com/users/rupaligangarde/repos", RepoData::class)!!
    }
}