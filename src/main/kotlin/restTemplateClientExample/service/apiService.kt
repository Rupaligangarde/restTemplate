package restTemplateClientExample.service

import restTemplateClientExample.model.Repo

interface apiService {
    fun getRepos(): List<Repo>
}