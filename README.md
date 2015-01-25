# gitlab-view-users

Front-end for viewing users on a [Gitlab](https://about.gitlab.com/) instance.

![screen](https://github.com/gaving/gitlab-view-users/raw/master/docs/1.png)

## Usage

- `cp resources/config.json config.json`
- configure `config.json` to point to gitlab url
- `java -cp ".:gitlab-users-0.1.0-SNAPSHOT-standalone.jar" gitlab_users.core`
