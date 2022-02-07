
## Azure App Service Deploy

```sh
# 環境変数設定
export ORG_GRADLE_PROJECT_SUBSCRIPTION=xxxxxxxxxxx-xxxxxx-xxxxxxx
export ORG_GRADLE_PROJECT_RESOURCE_GROUP=xxxxxxxxxxxxx
export ORG_GRADLE_PROJECT_RESOURCE_APPNAME=xxxxxxxxxxxxx


# App Serviceにデプロイ
./gradlew azureWebAppDeploy
```

## APIs


```sh
# Hello World
curl {AppServiceのURL}/

# Logging Info
curl {AppServiceのURL}/log/info

# Logging Warn
curl {AppServiceのURL}/log/warn

# Logging Error
curl {AppServiceのURL}/log/error
```