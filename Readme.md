
## AppServiceにデプロイ

### 環境変数設定

```sh
# サブスクリプション
export ORG_GRADLE_PROJECT_SUBSCRIPTION=xxxxxxxxxxx-xxxxxx-xxxxxxx
# リソースグループ
export ORG_GRADLE_PROJECT_RESOURCE_GROUP=xxxxxxxxxxxxx
# アプリ名
export ORG_GRADLE_PROJECT_APPNAME=xxxxxxxxxxxxx
```

### App Serviceにデプロイ

```sh
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